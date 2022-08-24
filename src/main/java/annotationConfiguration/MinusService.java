package annotationConfiguration;

import org.springframework.stereotype.Component;

@Component("minus")
public class MinusService {
    public int minusService(int first,int second)
    {
        return  first-second;
    }
}
