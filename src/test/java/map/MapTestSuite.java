package map;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MapTestSuite {
    @Test
    public void testNumberOfRegions() {
        Map map = new Map();
        System.out.println(map.getRegionsSet().size());
        Set<Region> set = new HashSet<Region>(map.getRegionsSet());
        System.out.println(set.size());
    }
    @Test
    public void testPrintinMapNames() {
        Map map = new Map();
        map.getRegionsSet().stream().map(r -> r.getName()).forEach(System.out::println);
    }
    @Test
    public void testPrintingNumberOfNeighbours() {
        Map map = new Map();
        map.getRegionsSet().stream().filter(r -> r.getNeighbourRegions().size() == 8)
               .map(r -> "Region " + r.getName() + " has " + r.getNeighbourRegions().size() + " regions").sorted()
        .forEach(System.out::println);
        //map.getRegionsSet().stream()
         //       .flatMap(r -> r.getNeighbourRegions().stream())
          //     .map(r -> "Region " + r.getName())
           //     .forEach(System.out::println);
    }/*
    @Test
    public void testSearchPath() {
        Map map = new Map();
        List<Region> current = new ArrayList<Region>();
        List<Region> next = new ArrayList<Region>();
        List<Region> end = new ArrayList<Region>();

        current.add(map.getRegionsSet().get(0));
        next = current.get(0).getNeighbourRegions();
        end.add(map.getRegionsSet().get(6));

        while(true) {
            for(Region r: current) {
                if(r == end.get(0)) return;
                    next.add(r);
            }
            current = next;
            next = current;
        }
    }*/
}
