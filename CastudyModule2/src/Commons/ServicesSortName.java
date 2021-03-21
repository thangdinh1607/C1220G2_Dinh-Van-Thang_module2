package Commons;

import Models.Services;

import java.util.Comparator;

public class ServicesSortName implements Comparator<Services> {
    @Override
    public int compare(Services o1, Services o2) {
        return o1.getNameServices().compareTo(o2.getNameServices());
    }
}
