package movies.spring.data.neo4j.movies;

import org.springframework.data.neo4j.core.schema.Id;

public abstract class Base {

    @Id
    private final String name;

    private Integer version = 0;

    public Base(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}