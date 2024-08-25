/**
 Do not return anything, modify nums in-place instead.
 */
function rotate(nums: number[], k: number): void {
    if (k > nums.length) {
        k = k % nums.length;
    }

    const numsStart = nums.slice(nums.length - k, nums.length);
    const numsEnd = numsStart.concat(nums.slice(0, nums.length - k));

    for (let i = 0; i < nums.length; i++) {
        nums[i] = numsEnd[i];
    }
}
