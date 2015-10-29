package mx.iteso;

import mx.iteso.singleton.TableOrder;
import mx.iteso.singleton.tables.Table3;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Table3Test {

    @Test
    public void TestSingleton() {
        TableOrder tabla = Table3.getInstance();
        assertEquals(Table3.getInstance().hashCode(), tabla.hashCode());
    }

    @Test
    public void TestSameObject() {
        TableOrder tabla0 = Table3.getInstance();
        TableOrder tabla3 = Table3.getInstance();

        assertEquals(tabla0.hashCode(), tabla3.hashCode());
    }


    @Test
    public void TestClearOrder() {
        Table3.clearOrder();

    }
}
