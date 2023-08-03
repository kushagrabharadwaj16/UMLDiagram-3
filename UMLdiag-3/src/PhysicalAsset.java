import java.util.ArrayList;
import java.util.List;

public class PhysicalAsset {
    private List<PhysicalAssetProperty> properties;

    public PhysicalAsset() {
        this.properties = new ArrayList<>();
    }

    public void addProperty(PhysicalAssetProperty property) {
        properties.add(property);
    }

    public List<PhysicalAssetProperty> getProperties() {
        return properties;
    }
}