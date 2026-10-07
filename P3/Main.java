abstract class GardenTool{GardenTool(){}String use(){return "Using the tool in the garden";}}
class CuttingTool extends GardenTool{@Override String use(){return super.use()+", blade sharpened first";}}
class Pruner extends CuttingTool{@Override String use(){return super.use()+", then trimming branches precisely";}}
public class Main{public static void main(String[]a){System.out.println(new Pruner().use());}}