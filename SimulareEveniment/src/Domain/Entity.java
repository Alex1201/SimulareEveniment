package Domain;

import java.util.Objects;

public abstract class Entity {
    private int id;

    public Entity() {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return "Entiry{" +
                "id='" + id + '\''+ "}";
    }

    public boolean equals(Object o){
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entity entity = (Entity) o;
        return Objects.equals(id, entity.id);
    }

    public int hashCode() {
        return Objects.hashCode(id);
    }

    public abstract String getDate();
}
