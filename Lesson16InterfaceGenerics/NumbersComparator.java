package Lessons.Lesson16InterfaceGenerics;

public interface NumbersComparator {
    int compare(Integer a, Integer b);

    public static final NumbersComparator MORE = new NumbersComparator() {// anonimous class
        @Override
        public int compare(Integer a, Integer b) {
            if (a > b) return 1;
            if (a < b) return -1;
            return 0;
        }
    };
}

