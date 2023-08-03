import java.util.ArrayList;
import java.util.List;

public class PhysicalAssetClass extends PhysicalAsset {
    private List<PhysicalAssetClassProperty> classProperties;

    public PhysicalAssetClass() {
        this.classProperties = new ArrayList<>();
    }

    public void addClassProperty(PhysicalAssetClassProperty classProperty) {
        classProperties.add(classProperty);
    }

    public List<PhysicalAssetClassProperty> getClassProperties() {
        return classProperties;
    }
}