package by.courses.java.streamapi.operation;


public interface Operation<E extends by.courses.java.streamapi.entity.UserBase> {
    java.util.Collection<E> removeWithMaxAge(java.util.Collection<E> entities);

    java.util.Collection<E> removeAllOlder(java.util.Collection<E> entities, int age);

    double getAverageAge(java.util.Collection<E> entities);

    E getThirdInCollection(java.util.Collection<E> entities);

    java.util.Collection<E> getTwoUsersStartingFromSecond(java.util.Collection<E> entities);

    boolean isCharacterPresentInAllNames(java.util.Collection<E> entities, java.lang.String character);

    java.util.Collection<E> addValueToAllNames(java.util.Collection<E> entities, java.lang.String value);

    java.util.Collection<E> sortByNameThanByAge(java.util.Collection<E> entities);
}

