function removeElement(nums: number[], val: number): number {
    let k = 0;

    for (let i = 0; i < nums.length; i++) {
        if (nums[i] === val) {
            nums[i] = nums[nums.length - 1 - k];
            nums[nums.length - 1 - k] = undefined;
            i--;
            k++;
        }
    }

    return k;
}
