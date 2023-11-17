package resources;
/*
Write the programme that tell you which line pass through particular stations. Just use Zone 1 stations name
 */

import java.util.Scanner;

public class Programme_10_TubeLine {
    public static void main(String[] args) {

        //List of all station in Zone 1 of London
        String[] tubeStationZone1= new String[]{"Aldgate", "Aldgate East", "Angel", "Baker Street", "Bank", "Barbican", "Bayswater", "Blackfriars",
                "Bond Street", "Borough", "Cannon Street", "Chancery Lane", "Charing Cross", "Covent Garden", "Earl's Court",
                "Edgware Road", "Elephant & Castle", "Embankment", "Euston", "Euston Square", "Farringdon", "Gloucester Road",
                "Goodge Street", "Great Portland Street", "Green Park", "High Street Kensington", "Holborn", "Hyde Park Corner", "King's Cross",
                "Knightsbridge", "Lambeth North", "Lancaster Gate", "Leicester Square", "Liverpool Street", "London Bridge", "Mansion House",
                "Marble Arch", "Marylebone", "Monument", "Moorgate", "Notting Hill Gate", "Old Street", "Oxford Circus", "Paddington",
                "Piccadilly Circus", "Pimlico", "Queensway", "Regent's Park", "Russell Square", "Sloane Square",
                "South Kensington", "St Pancras", "St. Paul's", "Temple", "Tottenham Court Road", "Tower Gateway",
                "Tower Hill", "Vauxhall", "Victoria", "Warren Street", "Waterloo East", "Waterloo", "Westminster"};

        System.out.println(tubeStationZone1.length);//for debug purpose
        int length=tubeStationZone1.length;

        String[][] londonUGLines=new String[12][length];
        londonUGLines[0][0]="Bakerloo Line";//Line name
        londonUGLines[0][1]="Baker Street";//Station name
        londonUGLines[0][2]="Charing Cross";
        londonUGLines[0][3]="Edgware Road";
        londonUGLines[0][4]="Elephant & Castle";
        londonUGLines[0][5]="Embankment";
        londonUGLines[0][6]="Lambeth North";
        londonUGLines[0][7]="Marylebone";
        londonUGLines[0][8]="Oxford Circus";
        londonUGLines[0][9]="Regent's Park";
        londonUGLines[0][10]="Waterloo";


        londonUGLines[1][0] = "Central Line";
        londonUGLines[1][1] = "Aldgate";
        londonUGLines[1][2] = "Baker Street";
        londonUGLines[1][3] = "Barbican";
        londonUGLines[1][4] = "Bayswater";
        londonUGLines[1][5] = "Bank";
        londonUGLines[1][6] = "Bond Street";
        londonUGLines[1][7] = "Chancery Lane";
        londonUGLines[1][8] = "Holborn";
        londonUGLines[1][9] = "Lancaster Gate";
        londonUGLines[1][10] = "Liverpool Street";
        londonUGLines[1][11] = "Marble Arch";
        londonUGLines[1][12] = "Notting Hill Gate";
        londonUGLines[1][13] = "Oxford Circus";
        londonUGLines[1][14] = "Queensway";
        londonUGLines[1][15] = "St. Paul's";
        londonUGLines[1][16] = "Tottenham Court Road";

        Scanner scan = new Scanner(System.in);
        System.out.println("PLease enter tne tube station's name of Zone1:");
        //Input wizard for the user, and store his/her input as a variable
        String userTubeStation=scan.nextLine();
        String catchStationName="";

        //Checking, if user input is present in the list of Zone 1 stations
        for(int i=0;i<tubeStationZone1.length;i++){
            if(userTubeStation.equalsIgnoreCase(tubeStationZone1[1])){
                catchStationName=tubeStationZone1[i];
            }
        }
//Logic to find the line names from the given inout from the user
        if(userTubeStation.equalsIgnoreCase(catchStationName)){
            System.out.println(userTubeStation+" Station is in Zone 1.");
            System.out.println("---------------------------------------------------");
            System.out.println("Following lines passing through the given tube station: " + userTubeStation);
            System.out.println("---------------------------------------------------");
            System.out.println(londonUGLines.length);//for debugging purpose
            for(int x=0;x<londonUGLines.length;x++){
                for(int y=1;y< tubeStationZone1.length;y++){
                    String match=londonUGLines[x][y];
                    System.out.println("I am here line:176"+ match);//for debug purpose
                    if(userTubeStation.equalsIgnoreCase(match)){
                        System.out.println(londonUGLines[x][0]);//first elements of multi dimension array is the line name


                    }
                }
            }
        }else{
            System.out.println("Station is not in the Zone 1.");
        }
    }
}
