let removeElement = function(nums, val) {
    let numsLength = nums.length;
    let i = 0;
    let j = numsLength -1;
    let counter = 0;
    let temp;
    while (i <= j){
        while (i <= j && nums[j] === val){
            ++counter;
            --j;
            nums.pop();
        }
        if(i <= j && nums[i] === val){
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            counter++;
            // ++i;
            --j;
            nums.pop();
            break;
        }
        ++i;
    }
    return numsLength - counter;
};

let nums = [4,2,0,2,2,1,4,4,1,4,3,2];

console.log(removeElement(nums, 4))
console.log(nums);