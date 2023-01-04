package service;

import module.Integral;
import repository.IntegralRepository;

public class IntegralService {
    private final IntegralRepository integralRepository = new IntegralRepository();

    public Integral generateIntegral(double a, double b, double D, String functionAsString) {
        IntegralSolver integralSolver = new IntegralSolver(a, b, D, functionAsString);
        double result = integralSolver.calculateResult();

        return new Integral(a, b, D, functionAsString, result);
    }

    public void saveIntegral(Integral integral) {
        integralRepository.saveIntegral(integral);
    }

    public void getIntegralFromFile() {
      Integral f = integralRepository.getLastIntegral();
    }
}
