package computerWarehouse;

import java.util.Arrays;

public class EvaluatorComputer implements IEvaluator{
    @Override
    public double sum(Components... components) {
        return Arrays.stream(components).map(Components::getPrice).reduce(0.0, Double::sum);
    }
}
