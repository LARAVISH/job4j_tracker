package ru.job4j.map;



import java.util.*;

public class Weather {
    public static List<Info> editData(List<Info> list) {
       List<Info> rsl = new ArrayList<>();
       Map<String,Integer> map = new HashMap<>();
       for(Info el : list){
           map.computeIfPresent(el.getCity(),(key,value) -> value + el.getRainfall());
           map.putIfAbsent(el.getCity(),el.getRainfall());
       }
       for(String str : map.keySet()){
           rsl.add(new Info(str,map.get(str)));
       }

        return rsl;
    }

    public static class Info {
        private String city;

        private int rainfall;

        public Info(String city, int rainfall) {
            this.city = city;
            this.rainfall = rainfall;
        }

        public String getCity() {
            return city;
        }

        public int getRainfall() {
            return rainfall;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Info info = (Info) o;
            return rainfall == info.rainfall &&
                    Objects.equals(city, info.city);
        }

        @Override
        public int hashCode() {
            return Objects.hash(city, rainfall);
        }
    }
}