package project.covidex.business.abstracts;

import java.util.List;

import project.covidex.core.utilities.results.DataResult;
import project.covidex.entities.concretes.PatientSummary;

public interface PatientSummaryService {
	DataResult<List<PatientSummary>>getAll();
	DataResult<List<PatientSummary>> getByIdentity(String userIdentity);
}
