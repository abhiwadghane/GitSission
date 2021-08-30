package Day5;
import java.time.LocalDate;
public class HashCode {
	

	    private final String firstName;
	    private final String lastName;
	    private final LocalDate dob;

	    public HashCode(String firstName, String lastName, LocalDate dob) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.dob = dob;
	    }

	    

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) {
	            return true;
	        }
	        if (!(o instanceof HashCode)) {
	            return false;
	        }
	        HashCode p = (HashCode)o;
	        return firstName.equals(p.firstName)
	                && lastName.equals(p.lastName)
	                && dob.equals(p.dob);
	    }
	}

