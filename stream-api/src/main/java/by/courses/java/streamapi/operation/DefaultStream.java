package by.courses.java.streamapi.operation;

import by.courses.java.streamapi.entity.UserBase;

import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;

public class DefaultStream implements Operation<UserBase> {

    @Override
    public Collection<UserBase> removeWithMaxAge(Collection<UserBase> entities) {
        return entities.stream()
                .filter(x -> x.getAge() < entities.stream().mapToInt(UserBase::getAge).max().getAsInt())
                .collect(Collectors.toList());
    }

    @Override
    public Collection<UserBase> removeAllOlder(Collection<UserBase> entities, int age) {
        return entities.stream()
                .filter(x -> x.getAge()<=age)
                .collect(Collectors.toList());
    }

    @Override
    public double getAverageAge(Collection<UserBase> entities) {
        return entities.stream()
                .mapToInt(UserBase::getAge)
                .average()
                .getAsDouble();
    }

    @Override
    public UserBase getThirdInCollection(Collection<UserBase> entities) {
        return null;
        /*entities.stream()
                .skip(2)
                .limit(3)
                .findFirst()*/
    }

    @Override
    public Collection<UserBase> getTwoUsersStartingFromSecond(Collection<UserBase> entities) {
        return null;
        /*entities.stream()
                .skip(1)
                .limit(3)
                .findAny()*/
    }

    @Override
    public boolean isCharacterPresentInAllNames(Collection<UserBase> entities, String character) {
        return false;
    }

    @Override
    public Collection<UserBase> addValueToAllNames(Collection<UserBase> entities, String value) {
        return null;
    }

    @Override
    public Collection<UserBase> sortByNameThanByAge(Collection<UserBase> entities) {
        return null;
    }
}