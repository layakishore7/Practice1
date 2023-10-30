import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {

    public static void main(String[] args) {

        List<MyObject> myList = new ArrayList<>();

        myList.add(new MyObject(1, "Laya Kishore"));
        myList.add(new MyObject(2, "Nookesh"));

        Map<Integer,String> myMap = myList.stream()
                .collect(Collectors.toMap(MyObject::getId,MyObject::getName));
        Map<Integer, String> myMap1 = new HashMap<>();
        for (MyObject obj : myList) {
            myMap.put(obj.getId(), obj.getName());
        }
       // System.out.println(myMap1);

        myMap.forEach((key,value)-> System.out.println(key+" "+value));


        List<Map.Entry<Integer,String>> myList1 = new ArrayList<>();

        myList1.addAll(myMap.entrySet());
        System.out.println(myList1);

        for (var map : myList1){
            System.out.print(map.getKey()+" "+map.getValue());
        }
    }
}
