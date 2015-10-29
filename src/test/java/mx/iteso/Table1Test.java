package mx.iteso;

import mx.iteso.singleton.TableOrder;
import mx.iteso.singleton.tables.Table1;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Table1Test {

    @Test
    public void TestSingleton() {
        TableOrder tabla = Table1.getInstance();
        assertEquals(Table1.getInstance().hashCode(), tabla.hashCode());
    }

    @Test
    public void TestSameObject() {
        TableOrder tabla0 = Table1.getInstance();
        TableOrder tabla1 = Table1.getInstance();

        assertEquals(tabla0.hashCode(), tabla1.hashCode());
    }


    @Test
    public void TestClearOrder() {
        Table1.clearOrder();

    }
}
