package composite.ex2;

import java.util.List;

public record Folder(List<FileComponent> listFileComponent) implements FileComponent {

    @Override
    public void showProperty() {
        listFileComponent.forEach(fileComponent -> {
            if (fileComponent instanceof File file) {
                file.showProperty();
            }
            else if (fileComponent instanceof Folder folder) {
                folder.showProperty();
            }
        });
    }

    @Override
    public long size() {
        long total = 0;
        total += listFileComponent.stream().filter(
                fileComponent ->
                        fileComponent instanceof File
                )
                .mapToLong(FileComponent::size)
                .sum();
        total += listFileComponent.stream().filter(fileComponent ->
                fileComponent instanceof Folder
        ).mapToLong(FileComponent::size).sum();
        return total;
    }

    @Override
    public void add(FileComponent fileComponent) {
        listFileComponent.add(fileComponent);
    }

}
