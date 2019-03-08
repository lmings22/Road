import Bean.Car;
import Bean.Cross;
import Bean.Road;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        if(args.length != 3)
            return;
        String roadFile  = args[0];
        String carFile   = args[1];
        String crossFile = args[2];

        List<Road>   roadList = new ArrayList<>();
        List<Car>     carList = new ArrayList<>();
        List<Cross> crossList = new ArrayList<>();

        try{
            initRoadList(roadList, roadFile);
            initCarList(carList, carFile);
            initCrossList(crossList, crossFile);
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }

    private static void initRoadList(List list, String file) throws IOException {
        File roadfile = new File(file);
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(roadfile)));
        String line = null;
        while((line = reader.readLine()) != null){
            if(Pattern.compile("#\\(").matcher(line).find())
                continue;
            line = line.substring(1,line.length() - 1);
            String[] array = line.split(",");
            list.add(new Road(
                    Integer.parseInt(array[0].trim()),
                    Integer.parseInt(array[1].trim()),
                    Integer.parseInt(array[2].trim()),
                    Integer.parseInt(array[3].trim()),
                    Integer.parseInt(array[4].trim()),
                    Integer.parseInt(array[5].trim()),
                    Integer.parseInt(array[6].trim()) != 0));
        }
    }

    private static void initCarList(List list, String file) throws IOException{
        File carfile = new File(file);
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(carfile));
        BufferedReader reader = new BufferedReader(inputStreamReader);
        String line = null;
        while((line = reader.readLine()) != null){
            if(Pattern.compile("#\\(").matcher(line).find())
                continue;
            line = line.substring(1,line.length() - 1);
            String[] array = line.split(",");
            list.add(new Car(
                    Integer.parseInt(array[0].trim()),
                    Integer.parseInt(array[1].trim()),
                    Integer.parseInt(array[2].trim()),
                    Integer.parseInt(array[3].trim()),
                    Integer.parseInt(array[4].trim())));
        }
    }

    private static void initCrossList(List list, String file) throws IOException{
        File crossfile = new File(file);
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(crossfile));
        BufferedReader reader = new BufferedReader(inputStreamReader);
        String line = null;
        while((line = reader.readLine()) != null){
            if(Pattern.compile("#\\(").matcher(line).find())
                continue;
            line = line.substring(1,line.length() - 1);
            String[] array = line.split(",");
            list.add(new Cross(
                    Integer.parseInt(array[0].trim()),
                    Integer.parseInt(array[1].trim()),
                    Integer.parseInt(array[2].trim()),
                    Integer.parseInt(array[3].trim()),
                    Integer.parseInt(array[4].trim())));
        }
    }
}
