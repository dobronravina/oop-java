package service;

import org.json.JSONObject;
import repository.IntegralRepository;
import module.Integral;

public class IntegralService {
    private final IntegralRepository integralRepository = new IntegralRepository();

    public Integral generateIntegral(double a, double b, double D, String functionAsString) {
        IntegralSolver integralSolver = new IntegralSolver(a, b, D, functionAsString);
        double result = integralSolver.calculateResult();

        return new Integral(a, b, D, functionAsString, result);
    }

    public void saveIntegral(double a,double b,double D,String functionAsString,double result ) {
        integralRepository.saveIntegral( a, b, D,functionAsString, result );
    }

    public void getIntegralFromFile() {
      JSONObject f = integralRepository.getIntegralFromFile();
    }
}
