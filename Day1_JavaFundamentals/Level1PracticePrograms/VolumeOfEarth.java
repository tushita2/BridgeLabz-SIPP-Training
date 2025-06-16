package Level1PracticePrograms;

public class VolumeOfEarth {
    public static void main(String[] args) {
        double radius = 3; 
        double volumeInCubicKilometers = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        double volumeInCubicMiles = volumeInCubicKilometers * 1.6; 
        
        System.out.printf("The volume of the Earth in a %.2f cubic kilometers" +volumeInCubicKilometers +"and in cubic miles is: " +volumeInCubicMiles );
    }
}
