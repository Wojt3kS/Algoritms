package damian;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Sos> naszeSosy = new ArrayList<>();
        naszeSosy.add(new Sos());
        naszeSosy.add(new OstrySos());
        naszeSosy.add(new LagodnySos());
        for (Sos sos : naszeSosy) {
            System.out.println(sos.polejSosem());
        }

        Sos ukrytyOstrySos = new OstrySos();
        System.out.println(((OstrySos)ukrytyOstrySos).piecz());

    }
}
