// Generated by GraphWalker (http://www.graphwalker.org)
package Graphs;

import org.graphwalker.java.annotation.Model;
import org.graphwalker.java.annotation.Vertex;
import org.graphwalker.java.annotation.Edge;

@Model(file = "Graphs/cruiseControl.json")
public interface CruiseControl {

    @Edge()
    void resume();

    @Edge()
    void accelerator();

    @Edge()
    void engineOff();

    @Edge()
    void engineOFF();

    @Edge()
    void engineON();

    @Vertex()
    void standby();

    @Vertex()
    void idle();

    @Edge()
    void break();

    @Vertex()
    void active();

    @Vertex()
    void cruising();

    @Edge()
    void off();

    @Edge()
    void e_start();

    @Edge()
    void breake();

    @Vertex()
    void v_start();

    @Edge()
    void on();
}
