package domain;

/**
 * Created by wei62_000 on 2017/6/22.
 */
public class City {

    private Integer id;
    private String name;
    private Integer province_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getProvince_id() {
        return province_id;
    }

    public void setProvince_id(Integer province_id) {
        this.province_id = province_id;
    }

    @Override
    public String toString() {
        return id+"   "+name +  "  "+ province_id;
    }
}
