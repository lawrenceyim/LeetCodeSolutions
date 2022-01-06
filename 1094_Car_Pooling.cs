public class Solution {
    public bool CarPooling(int[][] trips, int capacity) {
        Sort<int>(trips, 1); 
        int passenger = 0;
        int position = 0;
        var riders = new List<List<int>>();
        foreach (int[] trip in trips) {
            passenger += trip[0];
            position = trip[1];
            riders.Add(new List<int>(){trip[2], trip[0]});
            for (int i = riders.Count - 1; i >= 0; i--) {
                if (riders[i][0] <= position) {
                    passenger -= riders[i][1];
                    riders.RemoveAt(i);                    
                }
            }
            if (passenger > capacity) return false;
        }
        return true;
    }
    
    private static void Sort<T>(T[][] data, int col) { 
        Comparer<T> comparer = Comparer<T>.Default;
        Array.Sort<T[]>(data, (x,y) => comparer.Compare(x[col],y[col])); 
    } 
}