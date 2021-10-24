package app;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import logic.ListItem;

import java.util.List;

public class ApplicationController
{

    @FXML
    private Button addNewListButton;

    @FXML
    private ListView<?> availableListView;

    @FXML
    private Label currentListTitleLabel;

    @FXML
    private CheckBox item1Checkbox;

    @FXML
    private Label item1DescriptionLabel;

    @FXML
    private DatePicker item1DueDatePicker;

    @FXML
    private Button item1RemoveButton;

    @FXML
    private CheckBox item2Checkbox;

    @FXML
    private Label item2DescriptionLabel;

    @FXML
    private DatePicker item2DueDatePicker;

    @FXML
    private Button item2RemoveButton;

    @FXML
    private CheckBox item3Checkbox;

    @FXML
    private Label item3DescriptionLabel;

    @FXML
    private DatePicker item3DueDatePicker;

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

    @FXML
    void addNewItemButtonPressed(ActionEvent actionEvent)
    {
        // Get reference to currently selected TodoList

        // Add new item to this TodoList
    }

    // Stand-in method for dynamically created remove item buttons
    @FXML
    void removeItem1ButtonPressed(ActionEvent event)
    {
        // Get index of remove button pressed

        // Remove ListItem in currently displayed TodoList at that index
    }

    @FXML
    void addNewListButtonPressed(ActionEvent event)
    {
        // Create blank TodoList and add it to the list of available lists
    }

    @FXML
    void removeSelectedListsButtonPressed(ActionEvent event)
    {
        // Get list of selected TodoLists in ListView

        // Remove them
    }

    public void viewAllListItemsRadioMenuItemSelected(ActionEvent actionEvent)
    {
        // Get all listItems from currently displayed list

        // Generate GridPane from list items

        // Attach GridPane to scene graph
    }

    public void viewIncompleteItemsOnlyRadioMenuItemSelected(ActionEvent actionEvent)
    {
        // Get all incomplete listItems from currently displayed list

        // Generate GridPane from list items

        // Attach GridPane to scene graph
    }

    public void viewCompletedItemsOnlyRadioMenuItemSelected(ActionEvent actionEvent)
    {
        // Get all completed listItems from currently displayed list

        // Generate GridPane from list items

        // Attach GridPane to scene graph
    }

    public void saveSelectedListsMenuItemSelected(ActionEvent actionEvent)
    {
        // Get list of currently selected items in ListView

        // Open a FileChooser so the user can specify where the selected TodoLists should be saved

        // Save these TodoList objects to that file
    }

    public void loadListsMenuItemSelected(ActionEvent actionEvent)
    {
        // Open a FileChooser so the user can specify from where the TodoLists should be loaded

        // Load lists from file

        // Add loaded lists to currently loaded lists
    }

    private GridPane todoListToGridPane(List<ListItem> items)
    {
        // Create new (n + 1) by 4 GridPane where n is the number of listItems in items

        // Add Label with text "Description" to Row 0, Column 1

        // Add Label with text "Due Date" to Row 0, Column 2

        // For each ListItem in items
            // Add Checkbox to Column 0
            // Add description Label to Column 1
            // Add DatePicker to Column 2
            // Add remove Button to Column 3

        return null;
    }

    private void updateSceneGraph(GridPane gp)
    {
        // Get current scene graph

        // Discard GridPane of currently displayed list

        // Attach new GridPane to scene graph

        // Execute changes/cleanup
    }

    public void initialize()
    {
        // Select viewAllListItemsRadioMenuItem by default

        // Initialize availableListView to empty list

        // Add listener to availableListView to update it whenever the available list changes

        // Add listener to availableListView to change the list shown on the right to match the currently selected list
    }
}
