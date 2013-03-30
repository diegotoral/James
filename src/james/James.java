import org.gnome.gdk.Event;

import org.gnome.gtk.Gtk;
import org.gnome.gtk.VBox;
// import org.gnome.gtk.Widget;
import org.gnome.gtk.Window;

import context.arch.discoverer.Discoverer;
// import context.arch.widget.Widget;
import context.arch.widget.WidgetXmlParser;

public class James {
    
    protected context.arch.widget.Widget gpsWidget;
    protected context.arch.widget.Widget clockWidget;

    public JamesUI ui;

    public James() {
        super();

        ui = new JamesUI();

        gpsWidget = WidgetXmlParser.createWidget("../data/gps-widget.xml");
        clockWidget = WidgetXmlParser.createWidget("../data/clock-widget.xml");
    }

    public class JamesUI extends VBox {
        
        public JamesUI() {
            super(false, 3);
        }
    }

    public static void main(String[] args) {
        James app;
        Window window;

        Gtk.init(args);
        Discoverer.start();

        app = new James();
        window = new Window();

        window.add(app.ui);
        window.setTitle("James dashboard");
        window.showAll();

        window.connect(new Window.DeleteEvent() {
            public boolean onDeleteEvent(org.gnome.gtk.Widget source, Event event) {
                Gtk.mainQuit();
                return false;
            }
        });

        Gtk.main();
    }
}