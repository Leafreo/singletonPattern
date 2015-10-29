package mx.iteso;

import mx.iteso.singleton.TableOrder;
import mx.iteso.singleton.tables.Table2;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Table2Test {

    @Test
    public void TestSingleton() {
        TableOrder tabla = Table2.getInstance();
        assertEquals(Table2.getInstance().hashCode(), tabla.hashCode());
    }

    @Test
    public void TestSameObject() {
        TableOrder tabla0 = Table2.getInstance();
        TableOrder tabla2 = Table2.getInstance();

        assertEquals(tabla0.hashCode(), tabla2.hashCode());
    }


    @Test
    public void TestClearOrder() {
        Table2.clearOrder();

    }
}
