class Solution:
    def maximumUnits(self, boxTypes: List[List[int]], truckSize: int) -> int:
        boxes = []
        for box in boxTypes:
            boxes.append({
                "quantity": box[0],
                "units": box[1]
            })
            
        boxes.sort(key = itemgetter("units"), reverse = True)
        current_box = 0
        units_loaded = 0
        while truckSize > 0 and current_box < len(boxes):
            while boxes[current_box]["quantity"] > 0 and truckSize > 0:
                truckSize -= 1
                units_loaded += boxes[current_box]["units"]
                boxes[current_box]["quantity"] -= 1
            current_box += 1
        return units_loaded
            