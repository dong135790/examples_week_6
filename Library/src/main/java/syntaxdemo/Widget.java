package syntaxdemo;

import java.util.ArrayList;
import java.util.List;

public class Widget {

    String name;
    public Widget(String name) {
        this.name = name;
    }
    public boolean setName(String name) {
        this.name = name;
        return true;
    }
    public String toString() {
        return name;
    }
    public static void main(String[] args) {
        List<Widget> widgets = new ArrayList<Widget>();
        widgets.add(new Widget("Widget1"));
        widgets.add(new Widget("Widget2"));
        widgets.stream().map(i -> i.setName("NEW NAME"))
                .toList();
        System.out.println(widgets);
    }


}
