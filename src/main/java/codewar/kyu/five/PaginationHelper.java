package codewar.kyu.five;

import java.util.List;

/**
 * For this exercise you will be strengthening your page-fu mastery.
 * You will complete the PaginationHelper class, which is a utility class helpful for querying paging information related to an array.
 * <p>
 * The class is designed to take in an array of values and an integer indicating how many items will be allowed per each page.
 * The types of values contained within the collection/array are not relevant.
 */
public class PaginationHelper<I> {

    private final int itemsPerPage;
    private final List<I> elements;

    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.elements = collection;
        this.itemsPerPage = itemsPerPage;
    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return elements.size();
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        return (int)Math.ceil(itemCount() / (float)itemsPerPage);
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     * Example:6-(1*4)=2;
     * 6-(2*4)=-1;
     */
    public int pageItemCount(int pageIndex) {
        if (isNegativeNumber(pageIndex)) {
            return -1;
        }
        int pageItem = elements.size() - pageIndex * itemsPerPage;
        if (isNegativeNumber(pageItem)) {
            return -1;
        }
        return Math.min(pageItem, itemsPerPage);
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     * Example:  80 / 10pg = 8
     */
    public int pageIndex(int itemIndex) {
        if (isNegativeNumber(itemIndex) || itemIndex >= itemCount()) {
            return -1;
        }
        return itemIndex / itemsPerPage;
    }

    private boolean isNegativeNumber(int itemIndex) {
        return itemIndex < 0;
    }

    private boolean biggerThanPagesSize(double pageIndex) {
        return pageIndex > pageCount();
    }
}
