package annotationConfiguration;

import org.springframework.stereotype.Component;

@Component("plus")
public class PlusService {
    public  int plusService(int first,int second)
    {
        return  first+second;
    }
}
