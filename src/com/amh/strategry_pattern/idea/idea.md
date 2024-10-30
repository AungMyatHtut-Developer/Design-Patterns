# Strategy Design Pattern Practice Scenarios

The Strategy Design Pattern is useful when you want to define a family of algorithms, encapsulate each one, and make them interchangeable. This pattern allows the algorithm to vary independently from the clients using it. Here are some practical scenarios to help you implement the Strategy Pattern.

---

## 1. Payment Processing System
- **Requirement**: Develop a payment system supporting multiple payment methods (e.g., credit card, PayPal, cryptocurrency). Users can choose their payment method at checkout.
- **Classes**:
    - `PaymentProcessor` Interface: Defines the `processPayment` method.
    - `CreditCardPayment`, `PayPalPayment`, `CryptoPayment` (Concrete Strategies): Implement different payment methods.
    - `Checkout` (Context): Allows setting a payment strategy and processes payments based on the user's choice.
- **Goal**: Enable customers to select their payment method at runtime without changing the core `Checkout` process.

---

## 2. Sorting Algorithms
- **Requirement**: Create a sorting application that sorts data using different algorithms (e.g., Bubble Sort, Merge Sort, Quick Sort). Users select the desired sorting strategy.
- **Classes**:
    - `SortStrategy` Interface: Defines a method for sorting.
    - `BubbleSort`, `MergeSort`, `QuickSort` (Concrete Strategies): Implement different sorting algorithms.
    - `Sorter` (Context): Uses a sorting strategy to sort data.
- **Goal**: Allow dynamic switching of sorting algorithms at runtime to meet performance requirements.

---

## 3. File Compression System
- **Requirement**: Implement a file compression tool that supports multiple formats (e.g., ZIP, RAR, GZIP). Users choose the algorithm based on file type or compression level.
- **Classes**:
    - `CompressionStrategy` Interface: Defines the `compress` method.
    - `ZipCompression`, `RarCompression`, `GzipCompression` (Concrete Strategies): Implement specific compression algorithms.
    - `FileCompressor` (Context): Uses a selected `CompressionStrategy` to compress files.
- **Goal**: Enable flexible file compression without modifying the main `FileCompressor` logic.

---

## 4. Game Character Behavior
- **Requirement**: Develop a game where characters can switch between different attack behaviors (e.g., melee, ranged, magic).
- **Classes**:
    - `AttackStrategy` Interface: Defines an `attack` method.
    - `MeleeAttack`, `RangedAttack`, `MagicAttack` (Concrete Strategies): Implement specific attack types.
    - `Character` (Context): Calls the chosen attack strategy.
- **Goal**: Allow characters to dynamically change their attack behavior based on game context.

---

## 5. Travel Route Planner
- **Requirement**: Create a travel route planner that can suggest routes based on different strategies (e.g., fastest, shortest, scenic).
- **Classes**:
    - `RouteStrategy` Interface: Defines a method for calculating routes.
    - `FastestRoute`, `ShortestRoute`, `ScenicRoute` (Concrete Strategies): Implement specific route calculations.
    - `RoutePlanner` (Context): Uses the selected strategy to plan routes.
- **Goal**: Allow users to choose different route calculations without modifying `RoutePlanner`.

---

## 6. File Export System
- **Requirement**: Create a file export tool that supports multiple formats (e.g., CSV, JSON, XML). Users choose the export format.
- **Classes**:
    - `ExportStrategy` Interface: Defines an `export` method.
    - `CSVExport`, `JSONExport`, `XMLExport` (Concrete Strategies): Implement export logic for specific formats.
    - `DataExporter` (Context): Uses the chosen export strategy.
- **Goal**: Provide flexible export options without changing `DataExporter`.

---

## 7. Notification System
- **Requirement**: Implement a notification system with multiple channels (e.g., email, SMS, push notifications).
- **Classes**:
    - `NotificationStrategy` Interface: Defines `sendNotification`.
    - `EmailNotification`, `SMSNotification`, `PushNotification` (Concrete Strategies): Implement specific notification channels.
    - `NotificationService` (Context): Uses the chosen notification strategy.
- **Goal**: Allow flexible notification options without altering `NotificationService`.

---

## 8. Discount Calculation System
- **Requirement**: Build a discount system for an e-commerce platform with varying discount strategies (e.g., percentage, fixed, BOGO).
- **Classes**:
    - `DiscountStrategy` Interface: Defines `calculateDiscount`.
    - `PercentageDiscount`, `FixedDiscount`, `BOGODiscount` (Concrete Strategies): Implement specific discount logic.
    - `Order` (Context): Applies the selected discount strategy.
- **Goal**: Support changing discount types without modifying `Order`.

---

## 9. Tax Calculation System
- **Requirement**: Develop a tax calculation system for international shopping. Each country has a unique tax calculation (e.g., VAT, GST).
- **Classes**:
    - `TaxStrategy` Interface: Defines `calculateTax`.
    - `USTax`, `CanadaTax`, `EUTax` (Concrete Strategies): Implement specific tax calculations.
    - `Checkout` (Context): Applies the chosen tax strategy.
- **Goal**: Enable flexible tax calculations based on location.

---

## 10. Data Validation System
- **Requirement**: Create a validation system with different criteria (e.g., regex, length, range) for data fields.
- **Classes**:
    - `ValidationStrategy` Interface: Defines a `validate` method.
    - `RegexValidation`, `LengthValidation`, `RangeValidation` (Concrete Strategies): Implement specific validation checks.
    - `DataField` (Context): Uses a validation strategy.
- **Goal**: Allow flexible validation criteria by selecting the desired strategy.

---

## 11. Document Formatter
- **Requirement**: Build a document formatter with various text formats (e.g., plain text, HTML, Markdown).
- **Classes**:
    - `FormatStrategy` Interface: Defines a `format` method.
    - `PlainTextFormatter`, `HTMLFormatter`, `MarkdownFormatter` (Concrete Strategies): Implement specific text formats.
    - `Document` (Context): Uses the chosen formatting strategy.
- **Goal**: Enable easy switching between formatting options without altering `Document`.

---

## 12. Investment Portfolio Strategy
- **Requirement**: Create an investment portfolio system with various strategies (e.g., aggressive, conservative, balanced).
- **Classes**:
    - `InvestmentStrategy` Interface: Defines an `invest` method.
    - `AggressiveInvestment`, `ConservativeInvestment`, `BalancedInvestment` (Concrete Strategies): Implement specific investment strategies.
    - `Portfolio` (Context): Applies the selected investment strategy.
- **Goal**: Allow users to change investment approaches without altering `Portfolio`.

---

Each of these scenarios offers a hands-on practice opportunity for designing flexible and modular solutions. Set up classes, interfaces, and methods to dynamically switch strategies based on user choice or business requirements.

