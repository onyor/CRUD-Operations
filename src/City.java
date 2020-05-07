public class City {
    private int id;
    private String name;
    private String countryCode;
    private String district;
    private int population;
    
    public City(int id, String name, String countryCode, String disctrict, int population){
        this.id=id;
        this.name=name;
        this.countryCode=countryCode;
        this.district=disctrict;
        this.population=population;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return id;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setCountry(String countryCode){
        this.countryCode=countryCode;
    }
    
    public String getCountry(){
        return countryCode;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
    
    public String getDistrict() {
        return district;
    }
    
    public void setPopulation(int population) {
        this.population = population;
    }
    
    public int getPopulation() {
        return population;
    }
}
