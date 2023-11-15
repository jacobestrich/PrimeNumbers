import java.util.ArrayList;
import java.util.List;

public class PrimeFactors 
{            
    public List<Integer> resolve(int value)
        {
            List<Integer> result = new ArrayList<Integer>();
            for (int candidate = 2; value > 1; candidate++)
            {
                for(; value % candidate == 0; value /= candidate)
                {
                    result.add(candidate);
                }
            }
            return result;
        }

}
