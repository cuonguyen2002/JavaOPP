public enum SeasonSP30 {
    //VÍ DỤ 2(season): TẠO ENUM BÊN NGOÀI LỚP(CLASS) VÀ KẾT HỢP VỚI MỘT CLASS KHÁC ĐỂ HIỂN THỊ NỘI DUNG


    //phần hằng số
    SPRING("MÙA XUÂN"), SUMMER("MÙA HẠ"), FALL("MÙA THU"), WINTER("MÙA ĐÔNG");

    //khởi tạo (constructor)
    SeasonSP30(String name) {
        value = name;
    }
    //thuộc tính (properties)
    private String value;

    //các method (getter)
    public String getValue() {
        return value;
    }
}