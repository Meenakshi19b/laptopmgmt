// Example data to simulate dynamic content
document.addEventListener('DOMContentLoaded', () => {
    // Admin Dashboard Data
    document.getElementById('total-laptops').innerText = 100;
    document.getElementById('assigned-laptops').innerText = 80;
    document.getElementById('available-laptops').innerText = 15;
    document.getElementById('under-maintenance').innerText = 5;

    // Employee Portal Data
    document.getElementById('laptop-details').innerText = "Dell XPS 13, Serial: 12345, Condition: Good";

    // Event listeners for forms
    const laptopRequestForm = document.getElementById('laptop-request-form');
    laptopRequestForm.addEventListener('submit', (e) => {
        e.preventDefault();
        const request = document.getElementById('laptop-request').value;
        alert("Laptop request submitted: " + request);
    });

    const issueReportForm = document.getElementById('issue-report-form');
    issueReportForm.addEventListener('submit', (e) => {
        e.preventDefault();
        const issueDescription = document.getElementById('issue-description').value;
        const issuePriority = document.getElementById('issue-priority').value;
        alert(`Issue reported: ${issueDescription} with priority ${issuePriority}`);
    });
});
