public class Policy {
    private int policyNumber;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height;
    private double weight;
    
    public Policy() {
        this.policyNumber = 0;
        this.providerName = "";
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.smokingStatus = "non-smoker";
        this.height = 0.0;
        this.weight = 0.0;
    }
    
    
    public Policy(int policyNumber, String providerName, String firstName,
                  String lastName, int age, String smokingStatus,
                  double height, double weight) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;
    }
    
    
    public int getPolicyNumber() {
        return policyNumber;
    }
    
    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }
    
    public String getProviderName() {
        return providerName;
    }
    
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getSmokingStatus() {
        return smokingStatus;
    }
    
    public void setSmokingStatus(String smokingStatus) {
        this.smokingStatus = smokingStatus;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    
    public double getBMI() {
        if (height <= 0) {
            return 0.0;
        }
        return (weight * 703.0) / (height * height);
    }
    
    
    
    public double getPrice() {
        final double BASE_FEE = 600.0;
        final double AGE_FEE = 75.0;
        final double SMOKER_FEE = 100.0;
        final double BMI_THRESHOLD = 35.0;
        final double BMI_FEE_PER_POINT = 20.0;
        
        double price = BASE_FEE;
        
        if (age > 50) {
            price += AGE_FEE;
        }
        
        if (smokingStatus.equalsIgnoreCase("smoker")) {
            price += SMOKER_FEE;
        }
        
        double bmi = getBMI();
        if (bmi > BMI_THRESHOLD) {
            price += (bmi - BMI_THRESHOLD) * BMI_FEE_PER_POINT;
        }
        
        return price;
    }
}