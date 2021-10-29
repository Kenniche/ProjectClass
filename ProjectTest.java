class ProjectTest {
    
    public static void main(String[] args) {
        
        //Define Object My Project
        Project myProject = new Project();
        System.out.println(myProject.getName());
        System.out.println(myProject.getDescription());
        System.out.println(myProject.getCost());

        //Define Object My Project 1
        Project myProject1 = new Project();
        myProject1.setName ("My Project 1");
        System.out.println(myProject1.getName());
        System.out.println(myProject1.getDescription());

        //Define Object My Project 2
        Project myProject2 = new Project();
        myProject2.setName ("My Project 2");
        myProject2.setDescription ("My Description 2");
        System.out.println(myProject2.getName());
        System.out.println(myProject2.getDescription());
        System.out.println(myProject2.getCost());

        //Define Object My Project 3
        Project myProject3 = new Project();
        myProject3.setName ("My Project 3");
        myProject3.setDescription ("My Description 3");
        System.out.println(myProject3.ElevatorPitch());

        // Define Array of Portfolio
        Portfolio myPortfolio = new Portfolio();
        myPortfolio.AddToPortfolio (myProject);
        myPortfolio.AddToPortfolio (myProject2);
        myPortfolio.AddToPortfolio (myProject3);  

        // Print all info about Portfolio    
        myPortfolio.showPortfolio();
    }
}
