package behavioral.iterator;

public class Pattern implements Collection {
    private String type;
    private String[] names;

    public Pattern(String type, String[] names) {
        this.type = type;
        this.names = names;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    @Override
    public Iterator getIterator() {
        return new NamesIterator();
    }

    private class NamesIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return names[index++];
        }
    }
}
