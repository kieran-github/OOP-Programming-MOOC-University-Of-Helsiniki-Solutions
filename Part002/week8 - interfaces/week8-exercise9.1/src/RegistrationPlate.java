public class RegistrationPlate {
    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    private final String regCode;
    private final String country;

    public RegistrationPlate(String regCode, String country) {
       this.regCode = regCode;
       this.country = country;
    }

    public String toString(){
        return country+ " "+regCode;
    }
    private String getRegCode() {
    	return this.regCode;
    }
    private String getCountry() {
    	return this.country;
    }
    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (getClass() != object.getClass()) {
            return false;
        }

        RegistrationPlate compared = (RegistrationPlate) object;

        if (this.country == null || this.regCode != compared.regCode) {
            return false;
        }

        return true;
    }
    
    @Override
    public int hashCode() {
        if (this.regCode == null) {
            return 7;
        }

        return this.country.hashCode() + this.regCode.hashCode();
    }
    
    
}
      