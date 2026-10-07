abstract class Drone{abstract String fly();}
interface Trackable{String getLocation();}
class DeliveryDrone extends Drone implements Trackable{private String id;DeliveryDrone(String i){id=i;}String fly(){return id+" flying";}public String getLocation(){return id+" at Sector 4";}}
class ScoutDrone extends Drone{private String id;ScoutDrone(String i){id=i;}String fly(){return id+" scouting";}}
class GroundRobot implements Trackable{private String id;GroundRobot(String i){id=i;}public String getLocation(){return id+" at Sector 4";}}
public class Main{static String getLocationIfTrackable(Object o){if(o instanceof Trackable)return ((Trackable)o).getLocation();return "Tracking not available";}public static void main(String[]a){System.out.println(getLocationIfTrackable(new DeliveryDrone("DR-1")));System.out.println(getLocationIfTrackable(new ScoutDrone("SC-1")));System.out.println(getLocationIfTrackable(new GroundRobot("GR-1")));}}