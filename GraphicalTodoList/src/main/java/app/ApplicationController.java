package app;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.ToggleGroup;

public class ApplicationController
{

    @FXML
    private Button addNewListButton;

    @FXML
    private Label currentListTitleLabel;

    @FXML
    private CheckBox item1Checkbox;

    @FXML
    private Label item1DescriptionLabel;

    @FXML
    private Label item1DueDateLabel;

    @FXML
    private Button item1RemoveButton;

    @FXML
    private CheckBox item2Checkbox;

    @FXML
    private Label item2DescriptionLabel;

    @FXML
    private Label item2DueDateLabel;

    @FXML
    private Button item2RemoveButton;

    @FXML
    private CheckBox item3Checkbox;

    @FXML
    private Label item3DescriptionLabel;

    @FXML
    private Label item3DueDateLabel;

    @FXML
    private Button item3RemoveButton;

    @FXML
    private ToggleGroup listViewModeToggleGroup;

    @FXML
    private MenuItem loadListsMenuItem;

    @FXML
    private Button removeSelectedListsButton;

    @FXML
    private MenuItem saveSelectedListsMenuItem;

    @FXML
    private RadioMenuItem viewAllItemsRadioMenuItem;

    @FXML
    private RadioMenuItem viewCompletedItemsOnlyRadioMenuItem;

    @FXML
    private RadioMenuItem viewIncompleteItemsOnlyRadioMenuItem;

}
