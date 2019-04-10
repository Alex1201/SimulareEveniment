package Tests;

import Domain.Entity;
import org.junit.jupiter.api.Test;

import static javax.print.attribute.standard.MediaSizeName.B;
import static org.testng.AssertJUnit.assertEquals;

public class EntityTest {

    Entity A = new Entity() {

        @Override
        public String getDate() {
            return null;
        }
    };

    @Test
    void equals1() {
        assertEquals(false,A.equals(B));
    }

    @Test
    void setId() {
        A.setId(2);
        assertEquals(2,A.getId());
    }

    @Test
    void getId() {
        assertEquals(A.getId(),B.getName());
    }

    @org.junit.jupiter.api.Test
    public String toString() {
        return null;
    }
}
