import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalDemo01
{
    public static void main(String[] args) 
    {
        List<Optional<String>> optionalList = new ArrayList<>();
        optionalList.add(Optional.of("BCA"));
        optionalList.add(Optional.of("MCA"));
        optionalList.add(Optional.of("B.TECH"));
        optionalList.add(Optional.of("M.Tech"));
        optionalList.add(Optional.of("BA"));
        optionalList.add(Optional.empty());
        
        for(Optional<String> optional : optionalList)
        {
        	
        	if(optional.isPresent())
        	{
        		System.out.println(optional.get());
        	}
        	else
        	{
        		System.err.println("No Value is available");
        	}
        }     
        
        
    }
}