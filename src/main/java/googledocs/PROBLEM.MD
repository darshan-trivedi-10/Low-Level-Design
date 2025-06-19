### 💡 LLD Question: **Design a Rich Text Document Editor**

#### Problem Statement:

Design a basic **rich-text document editor** that supports different types of content and formatting elements. The editor should allow clients to add various document elements such as text, images, new lines, and tab spaces. The document should be renderable into a final string format and should support saving the rendered content to different storage systems (like a file or database).

#### Functional Requirements:

1. The editor should support the following elements:

    * Text
    * Image (by path or URL)
    * New Line
    * Tab Space
2. The editor should support the following operations:

    * Adding an element to the document.
    * Rendering the document to a single string.
    * Saving the rendered document to a persistent store (file or DB).

#### Non-Functional Requirements:

* The design should be extensible (e.g., adding new element types should not require changing existing logic).
* The system should follow SOLID principles.
* Support for multiple persistence mechanisms should be pluggable (Strategy pattern is a good fit).
