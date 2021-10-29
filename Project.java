public class Project {
    private String name;
    private String description;
    private double initialCost = 0;
    private static String defaultName = "Default NAME";
    private static String defaultDesc = "DEfault DesC";

    public String getName() { 
        return name; 
    }
    public String getDescription() { 
        return description; 
    }
    public double getCost() { 
        return initialCost; 
    }
    public void setName(String name) { 
        this.name = name; 
    }
    public void setDescription(String description) { 
        this.description = description; 
    }

    public String ElevatorPitch() {
       // return String.format( %s (%02f)  %s, name, initialCost, description);
    return name + ", " + description;
    }
        
    public Project(String name, String description, double cost) {
        this.name = name;
        this.initialCost = cost;
        this.description = description;
    }
    public Project(String name) {
        this.name = name;
        this.description = defaultDesc;
    }
    public Project() {
        name = defaultName;
        description = defaultDesc;
    }

    //public String toString (){
        //System.out.println( myProject );
        //return myProject;
   // }



    public static void main( String args[] ){


        //Project myProject = new Project();
        //System.out.println( myproject );
        //toString();

        //Project myproject1 = new Project("This is my Project 1: ");
        //System.out.println( myproject1 );

    }

}
