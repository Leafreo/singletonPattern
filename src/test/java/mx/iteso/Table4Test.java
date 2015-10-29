package mx.iteso;

import mx.iteso.singleton.TableOrder;
import mx.iteso.singleton.tables.Table4;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Table4Test {

    @Test
    public void TestSingleton() {
        TableOrder tabla = Table4.getInstance();
        assertEquals(Table4.getInstance().hashCode(), tabla.hashCode());
    }

    @Test
    public void TestSameObject() {
        TableOrder tabla0 = Table4.getInstance();
        TableOrder tabla4 = Table4.getInstance();

        assertEquals(tabla0.hashCode(), tabla4.hashCode());
    }


    @Test
    public void TestClearOrder() {
        Table4.clearOrder();

    }
}
