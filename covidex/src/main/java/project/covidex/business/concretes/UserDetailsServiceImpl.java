package project.covidex.business.concretes;

import org.hibernate.criterion.MatchMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import project.covidex.dataAccess.abstracts.UserDao;
import project.covidex.entities.abstracts.User;
import project.covidex.securityJwt.UserPrincipal;

import java.util.Arrays;
import java.util.List;

@Service(value = "userDetailService")
@Transactional(isolation = Isolation.DEFAULT,readOnly = false, propagation = Propagation.REQUIRED)
public class UserDetailsServiceImpl implements UserDetailsService {


    @Autowired
    private UserDao usersDAO;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = usersDAO.findByUserIdentity(username);
        if(user == null){
            throw new UsernameNotFoundException("Invalid username or password.");
        }
        return new org.springframework.security.core.userdetails.User(user.getUserIdentity(), user.getPassword(), Arrays.asList(new SimpleGrantedAuthority("USERS")));
    }

    public UserDetails loadUserByIds(int id) {
        User user = null;
        List<User> userList = usersDAO.getById(id);
        if(userList.size()>0){
            user = userList.get(0);
        }else{
            throw new UsernameNotFoundException("User not found with id : " + id);
        }
        return UserPrincipal.create(user);
    }
}
